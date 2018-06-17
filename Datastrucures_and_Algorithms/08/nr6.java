// Angenommen alles wird abgerundet zum nächsten Int

void A(int n) {
    for (int i = 1; i <= 2*n/3+1; ++i)
            print(".");
}

void B(int n) {
    for(int i = 1; i <= n*n + n*n*n; ++i)
        print(".");
}

void C(int n) {
    int acc1 = 1, acc2 = 1;
    for (int i = 1; i <= n; ++i) {
        acc1 *= 3;
        acc2 *= n;
    }

    for (int i = 1; i <= acc1+acc2; ++i)
        print(".");
}





void E(int n) {
    int acc = 0;
    for (int i = 0; i < 2; ++i) {
        while (n > 1) {
            n /= 2;
            ++acc;
        }
        n = acc; acc = 0;
    }

    for (int i = 1; i <= n; ++i)
        print(".");
}

void F(int n) {
    int acc = 0;
    while (n > 1) {
        n /= 2;
        ++acc;
    }

    for (int i = 1; i*i*i <= acc; ++i)
        print(".");
}
