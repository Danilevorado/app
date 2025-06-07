package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public class d9 extends IOException {
    public d9(String str) {
        super(str);
    }

    static c9 a() {
        return new c9("Protocol message tag had invalid wire type.");
    }

    static d9 b() {
        return new d9("Protocol message contained an invalid tag (zero).");
    }

    static d9 c() {
        return new d9("Protocol message had invalid UTF-8.");
    }

    static d9 d() {
        return new d9("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static d9 e() {
        return new d9("Failed to parse the message.");
    }

    static d9 f() {
        return new d9("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
