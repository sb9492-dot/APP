% a) facts
passed_python(arun).
passed_python(bala).
passed_python(charan).
passed_ds(arun).
passed_ds(charan).
passed_ds(divya).

% b) rule
eligible(S) :- passed_python(S), passed_ds(S).

% c) query
:- initialization(main).
main :- write('Eligible students:'), nl,
        forall(eligible(S), (write(S), nl)),
        halt.