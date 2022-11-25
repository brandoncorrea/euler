module Euler01Test

open NUnit.Framework
open FSEuler.Euler1

[<Test>]
let SolvesEuler1 () =
    Assert.AreEqual(0, euler 1)
    Assert.AreEqual(0, euler 2)
    Assert.AreEqual(0, euler 3)
    Assert.AreEqual(3, euler 4)
    Assert.AreEqual(3, euler 5)
    Assert.AreEqual(8, euler 6)
    Assert.AreEqual(14, euler 7)
    Assert.AreEqual(14, euler 8)
    Assert.AreEqual(14, euler 9)
    Assert.AreEqual(23, euler 10)
    Assert.AreEqual(33, euler 11)
    Assert.AreEqual(233168, euler 1000)
