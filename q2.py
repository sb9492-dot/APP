from functools import reduce

salaries = {"Anu": 35000, "Bala": 42000, "Chitra": 38000,
            "Dinesh": 55000, "Esha": 28000}
print("Original salaries :", *salaries.items(), sep="\n   ")

# b) employees eligible (salary below 40,000)
eligible = dict(filter(lambda e: e[1] < 40000, salaries.items()))
print("Eligible employees:", *eligible.items(), sep="\n   ")

# a) revise salaries: 10% increment for those below 40,000
revised = dict(map(
    lambda e: (e[0], round(e[1] * 1.10, 2) if e[1] < 40000 else e[1]),
    salaries.items()))
print("Revised salaries  :", *revised.items(), sep="\n   ")

# c) total salary expenditure after revision
total = reduce(lambda a, b: a + b, revised.values())
print("Total expenditure : Rs.", round(total, 2))

# d) Functional programming suits salary records because every record is
#    processed the same way with no side effects, so the code is short,
#    predictable and easy to test.