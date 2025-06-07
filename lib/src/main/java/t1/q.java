package t1;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends Exception {

    /* renamed from: s, reason: collision with root package name */
    private static final StackTraceElement[] f27281s = new StackTraceElement[0];

    /* renamed from: m, reason: collision with root package name */
    private final List f27282m;

    /* renamed from: n, reason: collision with root package name */
    private r1.f f27283n;

    /* renamed from: o, reason: collision with root package name */
    private r1.a f27284o;

    /* renamed from: p, reason: collision with root package name */
    private Class f27285p;

    /* renamed from: q, reason: collision with root package name */
    private String f27286q;

    /* renamed from: r, reason: collision with root package name */
    private Exception f27287r;

    private static final class a implements Appendable {

        /* renamed from: m, reason: collision with root package name */
        private final Appendable f27288m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f27289n = true;

        a(Appendable appendable) {
            this.f27288m = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f27289n) {
                this.f27289n = false;
                this.f27288m.append("  ");
            }
            this.f27289n = c10 == '\n';
            this.f27288m.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z10 = false;
            if (this.f27289n) {
                this.f27289n = false;
                this.f27288m.append("  ");
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f27289n = z10;
            this.f27288m.append(charSequenceA, i10, i11);
            return this;
        }
    }

    public q(String str) {
        this(str, Collections.emptyList());
    }

    public q(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public q(String str, List list) {
        this.f27286q = str;
        setStackTrace(f27281s);
        this.f27282m = list;
    }

    private void a(Throwable th, List list) {
        if (!(th instanceof q)) {
            list.add(th);
            return;
        }
        Iterator it = ((q) th).e().iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), list);
        }
    }

    private static void b(List list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    private static void c(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof q) {
                ((q) th).h(appendable);
            } else {
                d(th, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void h(Appendable appendable) throws IOException {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List e() {
        return this.f27282m;
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List listF = f();
        int size = listF.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), (Throwable) listF.get(i10));
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f27286q);
        sb2.append(this.f27285p != null ? ", " + this.f27285p : "");
        sb2.append(this.f27284o != null ? ", " + this.f27284o : "");
        sb2.append(this.f27283n != null ? ", " + this.f27283n : "");
        List<Throwable> listF = f();
        if (listF.isEmpty()) {
            return sb2.toString();
        }
        if (listF.size() == 1) {
            str = "\nThere was 1 root cause:";
        } else {
            sb2.append("\nThere were ");
            sb2.append(listF.size());
            str = " root causes:";
        }
        sb2.append(str);
        for (Throwable th : listF) {
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    void j(r1.f fVar, r1.a aVar) {
        k(fVar, aVar, null);
    }

    void k(r1.f fVar, r1.a aVar, Class cls) {
        this.f27283n = fVar;
        this.f27284o = aVar;
        this.f27285p = cls;
    }

    public void l(Exception exc) {
        this.f27287r = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() throws IOException {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) throws IOException {
        h(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        h(printWriter);
    }
}
