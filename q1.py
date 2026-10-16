from functools import reduce

marks = [45, 78, 50, 92, 38, 97, 64, 49]
print("Original marks      :", marks)

# a) students who scored 50 or above
passed = list(filter(lambda m: m >= 50, marks))
print("Scored 50 or above  :", passed)

# b) add 5 grace marks, maximum capped at 100
graced = list(map(lambda m: min(m + 5, 100), marks))
print("After grace marks   :", graced)

# c) total marks using reduce
total = reduce(lambda a, b: a + b, graced)
print("Total marks         :", total)

# d) lambda lets us write small one-line functions inline,
#    so no separate def is needed for each simple operation.