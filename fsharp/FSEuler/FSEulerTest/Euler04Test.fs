module Euler04Test

open NUnit.Framework
open FSEuler.Euler4

[<Test>]
let SolvesEuler4() =
    Assert.AreEqual(9, euler 1)
    Assert.AreEqual(9009, euler 2)
    Assert.AreEqual(906609, euler 3)

[<Test>]
let ChecksForPalindrome() =
    Assert.IsTrue(isPalindrome 9009)
    Assert.IsTrue(isPalindrome 1)
    Assert.IsTrue(isPalindrome 2)
    Assert.IsFalse(isPalindrome 10)
    Assert.IsTrue(isPalindrome 11)
    Assert.IsTrue(isPalindrome 22)
    Assert.IsTrue(isPalindrome 101)
    Assert.IsFalse(isPalindrome 102)
    Assert.IsTrue(isPalindrome 232)
    Assert.IsTrue(isPalindrome 1001)
    Assert.IsFalse(isPalindrome 1002)
    Assert.IsTrue(isPalindrome 1111)
    Assert.IsFalse(isPalindrome 1099)
