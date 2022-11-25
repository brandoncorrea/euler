namespace FSEuler

module Euler2 =
    let isEven n = n % 2 = 0
    let lte limit n = n <= limit
    let nextFib (a, b) = Some(a + b, (b, a + b))
    let fibs() = Seq.unfold nextFib (0, 1)

    let euler limit =
        fibs()
        |> Seq.takeWhile (lte limit)
        |> Seq.filter isEven
        |> Seq.sum
    