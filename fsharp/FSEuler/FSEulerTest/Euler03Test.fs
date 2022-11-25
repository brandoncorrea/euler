module Euler03Test

open NUnit.Framework
open FSEuler.Euler3

[<Test>]
let SolvesEuler3 () =
    Assert.AreEqual(1, euler 1)
    Assert.AreEqual(2, euler 2)
    Assert.AreEqual(3, euler 3)
    Assert.AreEqual(2, euler 4)
    Assert.AreEqual(5, euler 5)
    Assert.AreEqual(3, euler 6)
    Assert.AreEqual(7, euler 7)
    Assert.AreEqual(2, euler 8)
    Assert.AreEqual(3, euler 9)
    Assert.AreEqual(5, euler 10)
    Assert.AreEqual(11, euler 11)
    Assert.AreEqual(29, euler 13195)
    Assert.AreEqual(6857, euler 600851475143L)
