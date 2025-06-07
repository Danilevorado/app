package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class kb implements x9 {

    /* renamed from: c, reason: collision with root package name */
    private final jb f10942c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f10940a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private long f10941b = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f10943d = 5242880;

    public kb(jb jbVar, int i10) {
        this.f10942c = jbVar;
    }

    public kb(File file, int i10) {
        this.f10942c = new gb(this, file);
    }

    static int a(InputStream inputStream) {
        return (k(inputStream) << 24) | k(inputStream) | (k(inputStream) << 8) | (k(inputStream) << 16);
    }

    static long c(InputStream inputStream) {
        return (k(inputStream) & 255) | ((k(inputStream) & 255) << 8) | ((k(inputStream) & 255) << 16) | ((k(inputStream) & 255) << 24) | ((k(inputStream) & 255) << 32) | ((k(inputStream) & 255) << 40) | ((k(inputStream) & 255) << 48) | ((k(inputStream) & 255) << 56);
    }

    static String e(ib ibVar) {
        return new String(j(ibVar, c(ibVar)), "UTF-8");
    }

    static void g(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    static void h(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    static void i(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        h(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] j(ib ibVar, long j10) throws IOException {
        long jA = ibVar.a();
        if (j10 >= 0 && j10 <= jA) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(ibVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + jA);
    }

    private static int k(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    private final void l(String str, hb hbVar) {
        if (this.f10940a.containsKey(str)) {
            this.f10941b += hbVar.f9081a - ((hb) this.f10940a.get(str)).f9081a;
        } else {
            this.f10941b += hbVar.f9081a;
        }
        this.f10940a.put(str, hbVar);
    }

    private final void m(String str) {
        hb hbVar = (hb) this.f10940a.remove(str);
        if (hbVar != null) {
            this.f10941b -= hbVar.f9081a;
        }
    }

    private static final String n(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.x9
    public final synchronized void b() {
        long length;
        ib ibVar;
        File fileA = this.f10942c.a();
        if (!fileA.exists()) {
            if (fileA.mkdirs()) {
                return;
            }
            ab.b("Unable to create cache dir %s", fileA.getAbsolutePath());
            return;
        }
        File[] fileArrListFiles = fileA.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                try {
                    length = file.length();
                    ibVar = new ib(new BufferedInputStream(new FileInputStream(file)), length);
                } catch (IOException unused) {
                    file.delete();
                }
                try {
                    hb hbVarA = hb.a(ibVar);
                    hbVarA.f9081a = length;
                    l(hbVarA.f9082b, hbVarA);
                    ibVar.close();
                } catch (Throwable th) {
                    ibVar.close();
                    throw th;
                }
            }
        }
    }

    public final File d(String str) {
        return new File(this.f10942c.a(), n(str));
    }

    public final synchronized void f(String str) {
        boolean zDelete = d(str).delete();
        m(str);
        if (zDelete) {
            return;
        }
        ab.a("Could not delete cache entry for key=%s, filename=%s", str, n(str));
    }

    @Override // com.google.android.gms.internal.ads.x9
    public final synchronized w9 o(String str) {
        hb hbVar = (hb) this.f10940a.get(str);
        if (hbVar == null) {
            return null;
        }
        File fileD = d(str);
        try {
            ib ibVar = new ib(new BufferedInputStream(new FileInputStream(fileD)), fileD.length());
            try {
                hb hbVarA = hb.a(ibVar);
                if (!TextUtils.equals(str, hbVarA.f9082b)) {
                    ab.a("%s: key=%s, found=%s", fileD.getAbsolutePath(), str, hbVarA.f9082b);
                    m(str);
                    return null;
                }
                byte[] bArrJ = j(ibVar, ibVar.a());
                w9 w9Var = new w9();
                w9Var.f17022a = bArrJ;
                w9Var.f17023b = hbVar.f9083c;
                w9Var.f17024c = hbVar.f9084d;
                w9Var.f17025d = hbVar.f9085e;
                w9Var.f17026e = hbVar.f9086f;
                w9Var.f17027f = hbVar.f9087g;
                List<fa> list = hbVar.f9088h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (fa faVar : list) {
                    treeMap.put(faVar.a(), faVar.b());
                }
                w9Var.f17028g = treeMap;
                w9Var.f17029h = Collections.unmodifiableList(hbVar.f9088h);
                return w9Var;
            } finally {
                ibVar.close();
            }
        } catch (IOException e5) {
            ab.a("%s: %s", fileD.getAbsolutePath(), e5.toString());
            f(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.x9
    public final synchronized void p(String str, w9 w9Var) {
        long j10 = this.f10941b;
        int length = w9Var.f17022a.length;
        long j11 = j10 + length;
        int i10 = this.f10943d;
        if (j11 <= i10 || length <= i10 * 0.9f) {
            File fileD = d(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileD));
                hb hbVar = new hb(str, w9Var);
                try {
                    g(bufferedOutputStream, 538247942);
                    i(bufferedOutputStream, hbVar.f9082b);
                    String str2 = hbVar.f9083c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    i(bufferedOutputStream, str2);
                    h(bufferedOutputStream, hbVar.f9084d);
                    h(bufferedOutputStream, hbVar.f9085e);
                    h(bufferedOutputStream, hbVar.f9086f);
                    h(bufferedOutputStream, hbVar.f9087g);
                    List<fa> list = hbVar.f9088h;
                    if (list != null) {
                        g(bufferedOutputStream, list.size());
                        for (fa faVar : list) {
                            i(bufferedOutputStream, faVar.a());
                            i(bufferedOutputStream, faVar.b());
                        }
                    } else {
                        g(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(w9Var.f17022a);
                    bufferedOutputStream.close();
                    hbVar.f9081a = fileD.length();
                    l(str, hbVar);
                    if (this.f10941b >= this.f10943d) {
                        if (ab.f6029b) {
                            ab.d("Pruning old cache entries.", new Object[0]);
                        }
                        long j12 = this.f10941b;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.f10940a.entrySet().iterator();
                        int i11 = 0;
                        while (it.hasNext()) {
                            hb hbVar2 = (hb) ((Map.Entry) it.next()).getValue();
                            if (d(hbVar2.f9082b).delete()) {
                                this.f10941b -= hbVar2.f9081a;
                            } else {
                                String str3 = hbVar2.f9082b;
                                ab.a("Could not delete cache entry for key=%s, filename=%s", str3, n(str3));
                            }
                            it.remove();
                            i11++;
                            if (this.f10941b < this.f10943d * 0.9f) {
                                break;
                            }
                        }
                        if (ab.f6029b) {
                            ab.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.f10941b - j12), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } catch (IOException e5) {
                    ab.a("%s", e5.toString());
                    bufferedOutputStream.close();
                    ab.a("Failed to write header for %s", fileD.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!fileD.delete()) {
                    ab.a("Could not clean up file %s", fileD.getAbsolutePath());
                }
                if (!this.f10942c.a().exists()) {
                    ab.a("Re-initializing cache after external clearing.", new Object[0]);
                    this.f10940a.clear();
                    this.f10941b = 0L;
                    b();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x9
    public final synchronized void q(String str, boolean z10) {
        w9 w9VarO = o(str);
        if (w9VarO != null) {
            w9VarO.f17027f = 0L;
            w9VarO.f17026e = 0L;
            p(str, w9VarO);
        }
    }
}
