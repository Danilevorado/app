package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class ny3 extends IOException {

    /* renamed from: m, reason: collision with root package name */
    private jz3 f12911m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12912n;

    public ny3(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f12911m = null;
    }

    public ny3(String str) {
        super(str);
        this.f12911m = null;
    }

    static my3 a() {
        return new my3("Protocol message tag had invalid wire type.");
    }

    static ny3 b() {
        return new ny3("Protocol message end-group tag did not match expected tag.");
    }

    static ny3 c() {
        return new ny3("Protocol message contained an invalid tag (zero).");
    }

    static ny3 d() {
        return new ny3("Protocol message had invalid UTF-8.");
    }

    static ny3 e() {
        return new ny3("CodedInputStream encountered a malformed varint.");
    }

    static ny3 f() {
        return new ny3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static ny3 g() {
        return new ny3("Failed to parse the message.");
    }

    static ny3 j() {
        return new ny3("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static ny3 k() {
        return new ny3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final ny3 h(jz3 jz3Var) {
        this.f12911m = jz3Var;
        return this;
    }

    final void l() {
        this.f12912n = true;
    }

    final boolean m() {
        return this.f12912n;
    }
}
