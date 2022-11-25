namespace FSEuler

module Euler1 =
    let isDivisibleBy3Or5 n =
        n % 3 = 0 || n % 5 = 0

    let euler n =
        [0..n - 1]
        |> Seq.filter isDivisibleBy3Or5
        |> Seq.sum
