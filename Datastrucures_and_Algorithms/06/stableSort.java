stableSort(Element E[]) {
    int n = E.length();
    for (int i = 0; i < n; ++i)
        E[i].key = E[i].key*n + i

    sort(E);

    for (int i = 0; i < n; ++i)
        E[i].key = floor(E[i].key / n);
}
