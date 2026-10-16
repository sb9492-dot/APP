from functools import reduce

usage = [8, 12, 15, 6, 11, 9, 14]   # units per day
RATE = 6

# a) days when consumption exceeded 10 units
high_days = list(filter(lambda u: u > 10, usage))
print("Daily usage        :", usage)
print("Days above 10 units:", high_days)

# b) cost for each day at Rs.6 per unit
cost = list(map(lambda u: u * RATE, usage))
print("Daily cost (Rs.)   :", cost)

# c) total consumption using reduce
total_units = reduce(lambda a, b: a + b, usage)
print("Total consumption  :", total_units, "units")

# d) pure function for the electricity bill
def electricity_bill(units_list, rate):
    return sum(map(lambda u: u * rate, units_list))

print("Total bill         : Rs.", electricity_bill(usage, RATE))
print("Original unchanged :", usage)