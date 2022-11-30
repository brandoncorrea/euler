def fibs
  Enumerator.new do |yielder|
    prev = 1
    cur = 2
    yielder.yield prev
    yielder.yield cur
    loop do
      temp = prev
      prev = cur
      cur += temp
      yielder.yield cur
    end
  end
end

def euler_2(n)
  fibs
    .lazy
    .take_while { |fib| fib <= n }
    .filter(&:even?)
    .sum
end
