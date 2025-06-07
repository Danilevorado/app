package r2;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final p2.b f26518a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f26519b;

    public h(p2.b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f26518a = bVar;
        this.f26519b = bArr;
    }

    public byte[] a() {
        return this.f26519b;
    }

    public p2.b b() {
        return this.f26518a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f26518a.equals(hVar.f26518a)) {
            return Arrays.equals(this.f26519b, hVar.f26519b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f26518a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f26519b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f26518a + ", bytes=[...]}";
    }
}
