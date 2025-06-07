package pa;

import java.io.File;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f25964c = new String[0];

    /* renamed from: a, reason: collision with root package name */
    private final File f25965a;

    /* renamed from: b, reason: collision with root package name */
    private final File f25966b;

    public b(ra.b bVar) {
        this.f25965a = bVar.c();
        this.f25966b = bVar.e();
    }

    private void d(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    private void e(File file, File file2) {
        if (file.exists()) {
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #3 {Exception -> 0x0045, blocks: (B:19:0x003d, B:21:0x0042), top: B:29:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(java.io.File r11, byte[] r12) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            java.lang.String r2 = "rw"
            r1.<init>(r11, r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            r2 = 0
            r1.setLength(r2)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.nio.channels.FileChannel$MapMode r5 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r6 = 0
            int r11 = r12.length     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            long r8 = (long) r11     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r4 = r0
            java.nio.MappedByteBuffer r11 = r4.map(r5, r6, r8)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r11.put(r12)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r0.write(r11)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r11.force()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r1.close()     // Catch: java.lang.Exception -> L2b
            r0.close()     // Catch: java.lang.Exception -> L2b
        L2b:
            return
        L2c:
            r11 = move-exception
            goto L3b
        L2e:
            r11 = move-exception
            goto L35
        L30:
            r11 = move-exception
            r1 = r0
            goto L3b
        L33:
            r11 = move-exception
            r1 = r0
        L35:
            ja.a r12 = new ja.a     // Catch: java.lang.Throwable -> L2c
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L2c
            throw r12     // Catch: java.lang.Throwable -> L2c
        L3b:
            if (r1 == 0) goto L40
            r1.close()     // Catch: java.lang.Exception -> L45
        L40:
            if (r0 == 0) goto L45
            r0.close()     // Catch: java.lang.Exception -> L45
        L45:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.b.f(java.io.File, byte[]):void");
    }

    private void g(String str, byte[] bArr) throws Throwable {
        if (bArr.length == 0) {
            throw new ja.a(String.format("%s key's value is zero bytes for saving", str));
        }
        File file = new File(this.f25965a, str);
        File file2 = new File(this.f25966b, str + ".bak");
        e(file, file2);
        f(file, bArr);
        d(file2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d A[Catch: Exception -> 0x0040, TRY_LEAVE, TryCatch #0 {Exception -> 0x0040, blocks: (B:18:0x0038, B:20:0x003d), top: B:24:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] h(java.io.File r10) throws java.lang.Throwable {
        /*
            r9 = this;
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.lang.String r2 = "r"
            r1.<init>(r10, r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            int r10 = (int) r2     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            java.nio.channels.FileChannel$MapMode r4 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            long r7 = (long) r10     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            r5 = 0
            r3 = r0
            java.nio.MappedByteBuffer r2 = r3.map(r4, r5, r7)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            r2.get(r10)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            r1.close()     // Catch: java.lang.Exception -> L26
            r0.close()     // Catch: java.lang.Exception -> L26
        L26:
            return r10
        L27:
            r10 = move-exception
            goto L36
        L29:
            r10 = move-exception
            goto L30
        L2b:
            r10 = move-exception
            r1 = r0
            goto L36
        L2e:
            r10 = move-exception
            r1 = r0
        L30:
            ja.a r2 = new ja.a     // Catch: java.lang.Throwable -> L27
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L27
            throw r2     // Catch: java.lang.Throwable -> L27
        L36:
            if (r1 == 0) goto L3b
            r1.close()     // Catch: java.lang.Exception -> L40
        L3b:
            if (r0 == 0) goto L40
            r0.close()     // Catch: java.lang.Exception -> L40
        L40:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.b.h(java.io.File):byte[]");
    }

    private byte[] i(String str) {
        File file = new File(this.f25966b, str + ".bak");
        File file2 = new File(this.f25965a, str);
        if (file.exists()) {
            d(file2);
            e(file, file2);
        }
        return h(file2);
    }

    private String[] j() {
        String[] list = this.f25965a.list();
        return list == null ? f25964c : list;
    }

    private void k(String str) {
        try {
            File file = new File(this.f25965a, str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e5) {
            throw new ja.a(e5);
        }
    }

    @Override // pa.a
    public String[] a() {
        return j();
    }

    @Override // pa.a
    public void b(String str, byte[] bArr) throws Throwable {
        g(str, bArr);
    }

    @Override // pa.a
    public byte[] c(String str) {
        return i(str);
    }

    @Override // pa.a
    public void remove(String str) {
        k(str);
    }
}
