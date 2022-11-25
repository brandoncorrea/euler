namespace FSEuler
open System

module Euler4 =
    let isPalindrome n =
        let n = n.ToString()
        n = (n |> seq |> Seq.rev |> String.Concat)

    let product x y = x * y

    let someMax x (y:option<int>) =
        if y.IsSome && y.Value > x
        then y.Value
        else x

    let largestPalindrome range pally n =
        Seq.map (product n) range
        |> Seq.filter isPalindrome
        |> Seq.tryHead
        |> someMax pally

    let euler n =
        let start = pown 10 (n - 1)
        let stop = (pown 10 n) - 1
        let range = [start..stop] |> Seq.rev
        Seq.fold (largestPalindrome range) 0 range
