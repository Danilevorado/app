package v5;

import e4.p;

/* loaded from: classes.dex */
public abstract class i extends Exception {
    protected i() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super(str);
        p.g(str, "Detail message must not be empty");
    }
}
