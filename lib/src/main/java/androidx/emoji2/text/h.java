package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.m;
import java.util.Arrays;

/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final e.i f2613a;

    /* renamed from: b, reason: collision with root package name */
    private final m f2614b;

    /* renamed from: c, reason: collision with root package name */
    private e.d f2615c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2616d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f2617e;

    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f2618a = 1;

        /* renamed from: b, reason: collision with root package name */
        private final m.a f2619b;

        /* renamed from: c, reason: collision with root package name */
        private m.a f2620c;

        /* renamed from: d, reason: collision with root package name */
        private m.a f2621d;

        /* renamed from: e, reason: collision with root package name */
        private int f2622e;

        /* renamed from: f, reason: collision with root package name */
        private int f2623f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f2624g;

        /* renamed from: h, reason: collision with root package name */
        private final int[] f2625h;

        b(m.a aVar, boolean z10, int[] iArr) {
            this.f2619b = aVar;
            this.f2620c = aVar;
            this.f2624g = z10;
            this.f2625h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f2618a = 1;
            this.f2620c = this.f2619b;
            this.f2623f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f2620c.b().j() || d(this.f2622e)) {
                return true;
            }
            if (this.f2624g) {
                if (this.f2625h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f2625h, this.f2620c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int a(int r6) {
            /*
                r5 = this;
                androidx.emoji2.text.m$a r0 = r5.f2620c
                androidx.emoji2.text.m$a r0 = r0.a(r6)
                int r1 = r5.f2618a
                r2 = 3
                r3 = 1
                r4 = 2
                if (r1 == r4) goto L1c
                if (r0 != 0) goto L14
            Lf:
                int r2 = r5.g()
                goto L4d
            L14:
                r5.f2618a = r4
                r5.f2620c = r0
                r5.f2623f = r3
            L1a:
                r2 = r4
                goto L4d
            L1c:
                if (r0 == 0) goto L26
                r5.f2620c = r0
                int r0 = r5.f2623f
                int r0 = r0 + r3
                r5.f2623f = r0
                goto L1a
            L26:
                boolean r0 = f(r6)
                if (r0 == 0) goto L2d
                goto Lf
            L2d:
                boolean r0 = d(r6)
                if (r0 == 0) goto L34
                goto L1a
            L34:
                androidx.emoji2.text.m$a r0 = r5.f2620c
                androidx.emoji2.text.g r0 = r0.b()
                if (r0 == 0) goto Lf
                int r0 = r5.f2623f
                if (r0 != r3) goto L46
                boolean r0 = r5.h()
                if (r0 == 0) goto Lf
            L46:
                androidx.emoji2.text.m$a r0 = r5.f2620c
                r5.f2621d = r0
                r5.g()
            L4d:
                r5.f2622e = r6
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.b.a(int):int");
        }

        g b() {
            return this.f2620c.b();
        }

        g c() {
            return this.f2621d.b();
        }

        boolean e() {
            return this.f2618a == 2 && this.f2620c.b() != null && (this.f2623f > 1 || h());
        }
    }

    h(m mVar, e.i iVar, e.d dVar, boolean z10, int[] iArr) {
        this.f2613a = iVar;
        this.f2614b = mVar;
        this.f2615c = dVar;
        this.f2616d = z10;
        this.f2617e = iArr;
    }

    private void a(Spannable spannable, g gVar, int i10, int i11) {
        spannable.setSpan(this.f2613a.a(gVar), i10, i11, 33);
    }

    private static boolean b(Editable editable, KeyEvent keyEvent, boolean z10) {
        i[] iVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean c(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            i[] iVarArr = (i[]) editable.getSpans(iMax, iMin, i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                for (i iVar : iVarArr) {
                    int spanStart = editable.getSpanStart(iVar);
                    int spanEnd = editable.getSpanEnd(iVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean d(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : b(editable, keyEvent, true) : b(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean e(CharSequence charSequence, int i10, int i11, g gVar) {
        if (gVar.d() == 0) {
            gVar.k(this.f2615c.a(charSequence, i10, i11, gVar.h()));
        }
        return gVar.d() == 2;
    }

    private static boolean f(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    CharSequence h(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        int iCharCount;
        i[] iVarArr;
        boolean z11 = charSequence instanceof n;
        if (z11) {
            ((n) charSequence).a();
        }
        p pVar = null;
        if (z11) {
            pVar = new p((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    pVar = new p((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, i.class) <= i11) {
                    pVar = new p(charSequence);
                }
            } finally {
                if (z11) {
                    ((n) charSequence).d();
                }
            }
        }
        if (pVar != null && (iVarArr = (i[]) pVar.getSpans(i10, i11, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = pVar.getSpanStart(iVar);
                int spanEnd = pVar.getSpanEnd(iVar);
                if (spanStart != i11) {
                    pVar.removeSpan(iVar);
                }
                i10 = Math.min(spanStart, i10);
                i11 = Math.max(spanEnd, i11);
            }
        }
        if (i10 != i11 && i10 < charSequence.length()) {
            if (i12 != Integer.MAX_VALUE && pVar != null) {
                i12 -= ((i[]) pVar.getSpans(0, pVar.length(), i.class)).length;
            }
            b bVar = new b(this.f2614b.f(), this.f2616d, this.f2617e);
            int iCodePointAt = Character.codePointAt(charSequence, i10);
            int i13 = 0;
            p pVar2 = pVar;
            loop1: while (true) {
                iCharCount = i10;
                while (i10 < i11 && i13 < i12) {
                    int iA = bVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i10 = iCharCount;
                    } else if (iA == 2) {
                        i10 += Character.charCount(iCodePointAt);
                        if (i10 < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, i10);
                        }
                    } else if (iA == 3) {
                        if (z10 || !e(charSequence, iCharCount, i10, bVar.c())) {
                            if (pVar2 == null) {
                                pVar2 = new p((Spannable) new SpannableString(charSequence));
                            }
                            a(pVar2, bVar.c(), iCharCount, i10);
                            i13++;
                        }
                    }
                }
                break loop1;
            }
            if (bVar.e() && i13 < i12 && (z10 || !e(charSequence, iCharCount, i10, bVar.b()))) {
                if (pVar2 == null) {
                    pVar2 = new p(charSequence);
                }
                a(pVar2, bVar.b(), iCharCount, i10);
            }
            if (pVar2 != null) {
                return pVar2.b();
            }
            if (z11) {
                ((n) charSequence).d();
            }
            return charSequence;
        }
        if (z11) {
            ((n) charSequence).d();
        }
        return charSequence;
    }
}
