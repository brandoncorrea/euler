namespace FSEuler

module Euler3 =
    let rec greatestPrime(n:int64, d:int64) =
        if n = d then n
        elif n % d = 0 then greatestPrime(n / d, d)
        else greatestPrime(n, d + 1L)

    let euler (n:int64) =
        if n = 1 then 1L else greatestPrime(n, 2)
