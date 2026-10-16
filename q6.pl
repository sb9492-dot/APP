% a) facts: employee(Name, Experience, Training, Rating)
employee(ravi,  6, completed,     5).
employee(priya, 3, completed,     4).
employee(kumar, 8, not_completed, 5).
employee(meena, 7, completed,     4).

% b) rule
promotion(N) :- employee(N, Exp, Training, Rating),
                Exp >= 5,
                Training = completed,
                Rating >= 4.

% c) query
:- initialization(main).
main :- write('Employees eligible for promotion:'), nl,
        forall(promotion(N), (write(N), nl)),
        halt.