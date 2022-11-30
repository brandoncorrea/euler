require 'problem002'

# https://projecteuler.net/index.php?section=problems&id=2

describe "Euler Problem #2" do
  it "Solves #1" do
    expect(euler_2(1)).to eq 0
    expect(euler_2(2)).to eq 2
    expect(euler_2(3)).to eq 2
    expect(euler_2(4)).to eq 2
    expect(euler_2(5)).to eq 2
    expect(euler_2(6)).to eq 2
    expect(euler_2(7)).to eq 2
    expect(euler_2(8)).to eq 10
    expect(euler_2(9)).to eq 10
    expect(euler_2(10)).to eq 10
    expect(euler_2(4000000)).to eq 4613732
  end
end
