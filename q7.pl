% a) facts: slot(Slot, VehicleType, Status)
slot(s1, car,  available).
slot(s2, bike, occupied).
slot(s3, car,  available).
slot(s4, bike, available).
slot(s5, car,  occupied).

% b) rule
available_slot(S, Type) :- slot(S, Type, available).

% c) query: available car slots
:- initialization(main).
main :- write('Available car parking slots:'), nl,
        forall(available_slot(S, car), (write(S), nl)),
        halt.