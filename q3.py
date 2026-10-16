prices = [450, 1200, 999, 2500, 1000, 3200]

# a) pure function: depends only on its input, changes nothing outside
def discounted_price(price):
    return price * 0.80

print("Original prices   :", prices)

# c) products costing more than Rs.1000
eligible = list(filter(lambda p: p > 1000, prices))
print("Eligible products :", eligible)

# b) apply discount to eligible products
discounted = list(map(discounted_price, eligible))
print("Discounted prices :", discounted)

# full list after sale (discount only when price > 1000)
final = list(map(lambda p: discounted_price(p) if p > 1000 else p, prices))
print("Final price list  :", final)
print("Original unchanged:", prices)

# d) discounted_price() returns a new value and never touches the list,
#    so the original product list stays unchanged.