package g1;

import android.net.Uri;
import android.os.Build;
import b1.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f23699a = new c0();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23700a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f23701b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f23702c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f23703d;

        static {
            int[] iArr = new int[b1.t.values().length];
            iArr[b1.t.ENQUEUED.ordinal()] = 1;
            iArr[b1.t.RUNNING.ordinal()] = 2;
            iArr[b1.t.SUCCEEDED.ordinal()] = 3;
            iArr[b1.t.FAILED.ordinal()] = 4;
            iArr[b1.t.BLOCKED.ordinal()] = 5;
            iArr[b1.t.CANCELLED.ordinal()] = 6;
            f23700a = iArr;
            int[] iArr2 = new int[b1.a.values().length];
            iArr2[b1.a.EXPONENTIAL.ordinal()] = 1;
            iArr2[b1.a.LINEAR.ordinal()] = 2;
            f23701b = iArr2;
            int[] iArr3 = new int[b1.k.values().length];
            iArr3[b1.k.NOT_REQUIRED.ordinal()] = 1;
            iArr3[b1.k.CONNECTED.ordinal()] = 2;
            iArr3[b1.k.UNMETERED.ordinal()] = 3;
            iArr3[b1.k.NOT_ROAMING.ordinal()] = 4;
            iArr3[b1.k.METERED.ordinal()] = 5;
            f23702c = iArr3;
            int[] iArr4 = new int[b1.n.values().length];
            iArr4[b1.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            iArr4[b1.n.DROP_WORK_REQUEST.ordinal()] = 2;
            f23703d = iArr4;
        }
    }

    private c0() {
    }

    public static final int a(b1.a aVar) {
        rb.h.e(aVar, "backoffPolicy");
        int i10 = a.f23701b[aVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new hb.j();
    }

    public static final Set b(byte[] bArr) throws IOException {
        ObjectInputStream objectInputStream;
        rb.h.e(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            try {
                int i10 = objectInputStream.readInt();
                for (int i11 = 0; i11 < i10; i11++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean z10 = objectInputStream.readBoolean();
                    rb.h.d(uri, "uri");
                    linkedHashSet.add(new b.c(uri, z10));
                }
                hb.q qVar = hb.q.f24177a;
                ob.a.a(objectInputStream, null);
                hb.q qVar2 = hb.q.f24177a;
                ob.a.a(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static final b1.a c(int i10) {
        if (i10 == 0) {
            return b1.a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return b1.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    public static final b1.k d(int i10) {
        if (i10 == 0) {
            return b1.k.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return b1.k.CONNECTED;
        }
        if (i10 == 2) {
            return b1.k.UNMETERED;
        }
        if (i10 == 3) {
            return b1.k.NOT_ROAMING;
        }
        if (i10 == 4) {
            return b1.k.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return b1.k.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    public static final b1.n e(int i10) {
        if (i10 == 0) {
            return b1.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return b1.n.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    public static final b1.t f(int i10) {
        if (i10 == 0) {
            return b1.t.ENQUEUED;
        }
        if (i10 == 1) {
            return b1.t.RUNNING;
        }
        if (i10 == 2) {
            return b1.t.SUCCEEDED;
        }
        if (i10 == 3) {
            return b1.t.FAILED;
        }
        if (i10 == 4) {
            return b1.t.BLOCKED;
        }
        if (i10 == 5) {
            return b1.t.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    public static final int g(b1.k kVar) {
        rb.h.e(kVar, "networkType");
        int i10 = a.f23702c[kVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && kVar == b1.k.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + kVar + " to int");
    }

    public static final int h(b1.n nVar) {
        rb.h.e(nVar, "policy");
        int i10 = a.f23703d[nVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new hb.j();
    }

    public static final byte[] i(Set set) throws IOException {
        rb.h.e(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    b.c cVar = (b.c) it.next();
                    objectOutputStream.writeUTF(cVar.a().toString());
                    objectOutputStream.writeBoolean(cVar.b());
                }
                hb.q qVar = hb.q.f24177a;
                ob.a.a(objectOutputStream, null);
                ob.a.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                rb.h.d(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int j(b1.t tVar) {
        rb.h.e(tVar, "state");
        switch (a.f23700a[tVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new hb.j();
        }
    }
}
