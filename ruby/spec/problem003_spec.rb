require 'problem003'

# https://projecteuler.net/index.php?section=problems&id=3

describe "Euler Problem #3" do
  it "Solves #1" do
    expect(euler_3(-2)).to eq 2
    expect(euler_3(0)).to eq 1
    expect(euler_3(1)).to eq 1
    expect(euler_3(2)).to eq 2
    expect(euler_3(3)).to eq 3
    expect(euler_3(4)).to eq 2
    expect(euler_3(5)).to eq 5
    expect(euler_3(6)).to eq 3
    expect(euler_3(7)).to eq 7
    expect(euler_3(8)).to eq 2
    expect(euler_3(9)).to eq 3
    expect(euler_3(10)).to eq 5
    expect(euler_3(13195)).to eq 29
    expect(euler_3(600851475143)).to eq 6857
  end
end
