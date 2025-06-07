package p1;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: m, reason: collision with root package name */
    private final File f25868m;

    /* renamed from: n, reason: collision with root package name */
    private final File f25869n;

    /* renamed from: o, reason: collision with root package name */
    private final File f25870o;

    /* renamed from: p, reason: collision with root package name */
    private final File f25871p;

    /* renamed from: q, reason: collision with root package name */
    private final int f25872q;

    /* renamed from: r, reason: collision with root package name */
    private long f25873r;

    /* renamed from: s, reason: collision with root package name */
    private final int f25874s;

    /* renamed from: u, reason: collision with root package name */
    private Writer f25876u;

    /* renamed from: w, reason: collision with root package name */
    private int f25878w;

    /* renamed from: t, reason: collision with root package name */
    private long f25875t = 0;

    /* renamed from: v, reason: collision with root package name */
    private final LinkedHashMap f25877v = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: x, reason: collision with root package name */
    private long f25879x = 0;

    /* renamed from: y, reason: collision with root package name */
    final ThreadPoolExecutor f25880y = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: z, reason: collision with root package name */
    private final Callable f25881z = new CallableC0172a();

    /* renamed from: p1.a$a, reason: collision with other inner class name */
    class CallableC0172a implements Callable {
        CallableC0172a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                if (a.this.f25876u == null) {
                    return null;
                }
                a.this.l0();
                if (a.this.d0()) {
                    a.this.i0();
                    a.this.f25878w = 0;
                }
                return null;
            }
        }
    }

    private static final class b implements ThreadFactory {
        private b() {
        }

        /* synthetic */ b(CallableC0172a callableC0172a) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f25883a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f25884b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f25885c;

        private c(d dVar) {
            this.f25883a = dVar;
            this.f25884b = dVar.f25891e ? null : new boolean[a.this.f25874s];
        }

        /* synthetic */ c(a aVar, d dVar, CallableC0172a callableC0172a) {
            this(dVar);
        }

        public void a() {
            a.this.W(this, false);
        }

        public void b() {
            if (this.f25885c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            a.this.W(this, true);
            this.f25885c = true;
        }

        public File f(int i10) {
            File fileK;
            synchronized (a.this) {
                if (this.f25883a.f25892f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f25883a.f25891e) {
                    this.f25884b[i10] = true;
                }
                fileK = this.f25883a.k(i10);
                a.this.f25868m.mkdirs();
            }
            return fileK;
        }
    }

    private final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f25887a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f25888b;

        /* renamed from: c, reason: collision with root package name */
        File[] f25889c;

        /* renamed from: d, reason: collision with root package name */
        File[] f25890d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f25891e;

        /* renamed from: f, reason: collision with root package name */
        private c f25892f;

        /* renamed from: g, reason: collision with root package name */
        private long f25893g;

        private d(String str) {
            this.f25887a = str;
            this.f25888b = new long[a.this.f25874s];
            this.f25889c = new File[a.this.f25874s];
            this.f25890d = new File[a.this.f25874s];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < a.this.f25874s; i10++) {
                sb2.append(i10);
                this.f25889c[i10] = new File(a.this.f25868m, sb2.toString());
                sb2.append(".tmp");
                this.f25890d[i10] = new File(a.this.f25868m, sb2.toString());
                sb2.setLength(length);
            }
        }

        /* synthetic */ d(a aVar, String str, CallableC0172a callableC0172a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f25874s) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f25888b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i10) {
            return this.f25889c[i10];
        }

        public File k(int i10) {
            return this.f25890d[i10];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f25888b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    public final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f25895a;

        /* renamed from: b, reason: collision with root package name */
        private final long f25896b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f25897c;

        /* renamed from: d, reason: collision with root package name */
        private final File[] f25898d;

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f25895a = str;
            this.f25896b = j10;
            this.f25898d = fileArr;
            this.f25897c = jArr;
        }

        /* synthetic */ e(a aVar, String str, long j10, File[] fileArr, long[] jArr, CallableC0172a callableC0172a) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f25898d[i10];
        }
    }

    private a(File file, int i10, int i11, long j10) {
        this.f25868m = file;
        this.f25872q = i10;
        this.f25869n = new File(file, "journal");
        this.f25870o = new File(file, "journal.tmp");
        this.f25871p = new File(file, "journal.bkp");
        this.f25874s = i11;
        this.f25873r = j10;
    }

    private void U() {
        if (this.f25876u == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void V(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void W(c cVar, boolean z10) {
        d dVar = cVar.f25883a;
        if (dVar.f25892f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f25891e) {
            for (int i10 = 0; i10 < this.f25874s; i10++) {
                if (!cVar.f25884b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f25874s; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                Y(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f25888b[i11];
                long length = fileJ.length();
                dVar.f25888b[i11] = length;
                this.f25875t = (this.f25875t - j10) + length;
            }
        }
        this.f25878w++;
        dVar.f25892f = null;
        if (dVar.f25891e || z10) {
            dVar.f25891e = true;
            this.f25876u.append((CharSequence) "CLEAN");
            this.f25876u.append(' ');
            this.f25876u.append((CharSequence) dVar.f25887a);
            this.f25876u.append((CharSequence) dVar.l());
            this.f25876u.append('\n');
            if (z10) {
                long j11 = this.f25879x;
                this.f25879x = 1 + j11;
                dVar.f25893g = j11;
            }
        } else {
            this.f25877v.remove(dVar.f25887a);
            this.f25876u.append((CharSequence) "REMOVE");
            this.f25876u.append(' ');
            this.f25876u.append((CharSequence) dVar.f25887a);
            this.f25876u.append('\n');
        }
        b0(this.f25876u);
        if (this.f25875t > this.f25873r || d0()) {
            this.f25880y.submit(this.f25881z);
        }
    }

    private static void Y(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c a0(String str, long j10) {
        U();
        d dVar = (d) this.f25877v.get(str);
        CallableC0172a callableC0172a = null;
        if (j10 != -1 && (dVar == null || dVar.f25893g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0172a);
            this.f25877v.put(str, dVar);
        } else if (dVar.f25892f != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0172a);
        dVar.f25892f = cVar;
        this.f25876u.append((CharSequence) "DIRTY");
        this.f25876u.append(' ');
        this.f25876u.append((CharSequence) str);
        this.f25876u.append('\n');
        b0(this.f25876u);
        return cVar;
    }

    private static void b0(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d0() {
        int i10 = this.f25878w;
        return i10 >= 2000 && i10 >= this.f25877v.size();
    }

    public static a e0(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                k0(file2, file3, false);
            }
        }
        a aVar = new a(file, i10, i11, j10);
        if (aVar.f25869n.exists()) {
            try {
                aVar.g0();
                aVar.f0();
                return aVar;
            } catch (IOException e5) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e5.getMessage() + ", removing");
                aVar.X();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i10, i11, j10);
        aVar2.i0();
        return aVar2;
    }

    private void f0() throws IOException {
        Y(this.f25870o);
        Iterator it = this.f25877v.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f25892f == null) {
                while (i10 < this.f25874s) {
                    this.f25875t += dVar.f25888b[i10];
                    i10++;
                }
            } else {
                dVar.f25892f = null;
                while (i10 < this.f25874s) {
                    Y(dVar.j(i10));
                    Y(dVar.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void g0() throws IOException {
        p1.b bVar = new p1.b(new FileInputStream(this.f25869n), p1.c.f25906a);
        try {
            String strF = bVar.f();
            String strF2 = bVar.f();
            String strF3 = bVar.f();
            String strF4 = bVar.f();
            String strF5 = bVar.f();
            if (!"libcore.io.DiskLruCache".equals(strF) || !"1".equals(strF2) || !Integer.toString(this.f25872q).equals(strF3) || !Integer.toString(this.f25874s).equals(strF4) || !"".equals(strF5)) {
                throw new IOException("unexpected journal header: [" + strF + ", " + strF2 + ", " + strF4 + ", " + strF5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    h0(bVar.f());
                    i10++;
                } catch (EOFException unused) {
                    this.f25878w = i10 - this.f25877v.size();
                    if (bVar.e()) {
                        i0();
                    } else {
                        this.f25876u = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25869n, true), p1.c.f25906a));
                    }
                    p1.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th) {
            p1.c.a(bVar);
            throw th;
        }
    }

    private void h0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f25877v.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = (d) this.f25877v.get(strSubstring);
        CallableC0172a callableC0172a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC0172a);
            this.f25877v.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f25891e = true;
            dVar.f25892f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f25892f = new c(this, dVar, callableC0172a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i0() {
        Writer writer = this.f25876u;
        if (writer != null) {
            V(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25870o), p1.c.f25906a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f25872q));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f25874s));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f25877v.values()) {
                bufferedWriter.write(dVar.f25892f != null ? "DIRTY " + dVar.f25887a + '\n' : "CLEAN " + dVar.f25887a + dVar.l() + '\n');
            }
            V(bufferedWriter);
            if (this.f25869n.exists()) {
                k0(this.f25869n, this.f25871p, true);
            }
            k0(this.f25870o, this.f25869n, false);
            this.f25871p.delete();
            this.f25876u = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25869n, true), p1.c.f25906a));
        } catch (Throwable th) {
            V(bufferedWriter);
            throw th;
        }
    }

    private static void k0(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            Y(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        while (this.f25875t > this.f25873r) {
            j0((String) ((Map.Entry) this.f25877v.entrySet().iterator().next()).getKey());
        }
    }

    public void X() throws IOException {
        close();
        p1.c.b(this.f25868m);
    }

    public c Z(String str) {
        return a0(str, -1L);
    }

    public synchronized e c0(String str) {
        U();
        d dVar = (d) this.f25877v.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f25891e) {
            return null;
        }
        for (File file : dVar.f25889c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f25878w++;
        this.f25876u.append((CharSequence) "READ");
        this.f25876u.append(' ');
        this.f25876u.append((CharSequence) str);
        this.f25876u.append('\n');
        if (d0()) {
            this.f25880y.submit(this.f25881z);
        }
        return new e(this, str, dVar.f25893g, dVar.f25889c, dVar.f25888b, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f25876u == null) {
            return;
        }
        Iterator it = new ArrayList(this.f25877v.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f25892f != null) {
                dVar.f25892f.a();
            }
        }
        l0();
        V(this.f25876u);
        this.f25876u = null;
    }

    public synchronized boolean j0(String str) {
        U();
        d dVar = (d) this.f25877v.get(str);
        if (dVar != null && dVar.f25892f == null) {
            for (int i10 = 0; i10 < this.f25874s; i10++) {
                File fileJ = dVar.j(i10);
                if (fileJ.exists() && !fileJ.delete()) {
                    throw new IOException("failed to delete " + fileJ);
                }
                this.f25875t -= dVar.f25888b[i10];
                dVar.f25888b[i10] = 0;
            }
            this.f25878w++;
            this.f25876u.append((CharSequence) "REMOVE");
            this.f25876u.append(' ');
            this.f25876u.append((CharSequence) str);
            this.f25876u.append('\n');
            this.f25877v.remove(str);
            if (d0()) {
                this.f25880y.submit(this.f25881z);
            }
            return true;
        }
        return false;
    }
}
