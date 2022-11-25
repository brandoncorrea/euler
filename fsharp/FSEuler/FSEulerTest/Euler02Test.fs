module Euler02Test

open NUnit.Framework
open FSEuler.Euler2

[<Test>]
let SolvesEuler2 () =
    Assert.AreEqual(0, euler 0)
    Assert.AreEqual(0, euler 1)
    Assert.AreEqual(2, euler 2)
    Assert.AreEqual(2, euler 3)
    Assert.AreEqual(2, euler 4)
    Assert.AreEqual(2, euler 5)
    Assert.AreEqual(2, euler 6)
    Assert.AreEqual(2, euler 7)
    Assert.AreEqual(10, euler 8)
    Assert.AreEqual(4613732, euler 4000000)
