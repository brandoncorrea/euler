require 'problem004'

# https://projecteuler.net/index.php?section=problems&id=4

describe "Euler Problem #4" do
  it "Solves #1" do
    expect(euler_4(1)).to eq 9
    expect(euler_4(2)).to eq 9009
    expect(euler_4(3)).to eq 906609
  end

  it "palindrome?" do
    expect(palindrome?(1)).to be true
    expect(palindrome?(10)).to be false
    expect(palindrome?(11)).to be true
    expect(palindrome?(12)).to be false
    expect(palindrome?(44)).to be true
    expect(palindrome?(909)).to be true
    expect(palindrome?(1000)).to be false
    expect(palindrome?(1001)).to be true
  end
end
