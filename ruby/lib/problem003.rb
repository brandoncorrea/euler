def divisible_by?(num, divisor)
  num % divisor == 0
end

def euler_3(n)
  n = n.abs
  return 1 if n <= 1

  divisor = 2
  while n != divisor
    if divisible_by?(n, divisor)
      n /= divisor
    else
      divisor += 1
    end
  end
  divisor
end
