import Control.Monad.Writer

swap f s xs = zipWith (\x y ->
    if x == f then xs !! s
    else if x == s then xs !! f
    else y) [0..] xs

fT :: [Int] -> Writer [String] [Int]
fT ls
    | length ls == 1    = do
        tell ["T: " ++ show ls]
        return ls
    | otherwise         = do
        tell ["T: " ++ show ls]
        i <- fS ls 0 0 (-1)
        let xs = swap 0 i ls
        res <- fT (tail xs)
        return (head xs : res)

fS :: [Int] -> Int -> Int -> Int -> Writer [String] Int
fS ls a b c
    | length ls == 0    = do
        tell ["S: " ++ show ls ++ " " ++ show [a,b,c]]
        return b
    | (head ls) > c     = do
        tell ["S: " ++ show ls ++ " " ++ show [a,b,c]]
        fS (tail ls) (a+1) a (head ls)
    | otherwise         = do
        tell ["S: " ++ show ls ++ " " ++ show [a,b,c]]
        fS (tail ls) (a+1) b c
