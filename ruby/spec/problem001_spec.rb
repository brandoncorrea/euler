require 'problem001'

# https://projecteuler.net/index.php?section=problems&id=1

describe "Euler Problem #1" do
  it "Solves #1" do
    expect(euler_1(1)).to eq 0
    expect(euler_1(2)).to eq 0
    expect(euler_1(3)).to eq 0
    expect(euler_1(4)).to eq 3
    expect(euler_1(5)).to eq 3
    expect(euler_1(6)).to eq 8
    expect(euler_1(7)).to eq 14
    expect(euler_1(8)).to eq 14
    expect(euler_1(9)).to eq 14
    expect(euler_1(10)).to eq 23
    expect(euler_1(1000)).to eq 233168
  end
end
