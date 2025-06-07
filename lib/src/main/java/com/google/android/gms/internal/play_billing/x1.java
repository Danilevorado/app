package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes.dex */
public class x1 extends IOException {

    /* renamed from: m, reason: collision with root package name */
    private u2 f19671m;

    public x1(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f19671m = null;
    }

    public x1(String str) {
        super(str);
        this.f19671m = null;
    }

    static w1 a() {
        return new w1("Protocol message tag had invalid wire type.");
    }

    static x1 b() {
        return new x1("Protocol message contained an invalid tag (zero).");
    }

    static x1 c() {
        return new x1("Protocol message had invalid UTF-8.");
    }

    static x1 d() {
        return new x1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static x1 e() {
        return new x1("Failed to parse the message.");
    }

    static x1 g() {
        return new x1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final x1 f(u2 u2Var) {
        this.f19671m = u2Var;
        return this;
    }
}
