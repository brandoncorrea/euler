def palindrome?(n)
  n_str = n.to_s
  n_str == n_str.reverse
end

def find_max_palindrome(domain, n)
  domain.reduce(-1) do |max_palindrome, num|
    product = num * n
    palindrome?(product) && product > max_palindrome ?
      product :
      max_palindrome
  end
end

def euler_4(n)
  domain = (1..10**n - 1)
  domain.reduce(-1) do |max_palindrome, num|
    palindrome = find_max_palindrome(domain, num)
    palindrome > max_palindrome ? palindrome : max_palindrome
  end
end
