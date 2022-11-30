def divisible_by_3_or_5(n)
  n % 3 == 0 || n % 5 == 0
end

def euler_1(n)
  (0..n - 1)
    .lazy
    .filter {|i| divisible_by_3_or_5(i) }
    .reduce(:+)
end
