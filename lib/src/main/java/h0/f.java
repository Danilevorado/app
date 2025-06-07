package h0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final b f23978a;

    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f23979a;

        /* renamed from: b, reason: collision with root package name */
        private final d f23980b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f23981c = true;

        a(TextView textView) {
            this.f23979a = textView;
            this.f23980b = new d(textView);
        }

        private InputFilter[] d(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f23980b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f23980b;
            return inputFilterArr2;
        }

        private SparseArray e(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                if (inputFilterArr[i10] instanceof d) {
                    sparseArray.put(i10, inputFilterArr[i10]);
                }
            }
            return sparseArray;
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayE = e(inputFilterArr);
            if (sparseArrayE.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayE.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayE.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void i() {
            this.f23979a.setFilters(a(this.f23979a.getFilters()));
        }

        private TransformationMethod k(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // h0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f23981c ? f(inputFilterArr) : d(inputFilterArr);
        }

        @Override // h0.f.b
        void b(boolean z10) {
            if (z10) {
                j();
            }
        }

        @Override // h0.f.b
        void c(boolean z10) {
            this.f23981c = z10;
            j();
            i();
        }

        void g(boolean z10) {
            this.f23981c = z10;
        }

        void j() {
            this.f23979a.setTransformationMethod(l(this.f23979a.getTransformationMethod()));
        }

        TransformationMethod l(TransformationMethod transformationMethod) {
            return this.f23981c ? k(transformationMethod) : h(transformationMethod);
        }
    }

    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        abstract void b(boolean z10);

        abstract void c(boolean z10);
    }

    private static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final a f23982a;

        c(TextView textView) {
            this.f23982a = new a(textView);
        }

        private boolean d() {
            return !androidx.emoji2.text.e.h();
        }

        @Override // h0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.f23982a.a(inputFilterArr);
        }

        @Override // h0.f.b
        void b(boolean z10) {
            if (d()) {
                return;
            }
            this.f23982a.b(z10);
        }

        @Override // h0.f.b
        void c(boolean z10) {
            if (d()) {
                this.f23982a.g(z10);
            } else {
                this.f23982a.c(z10);
            }
        }
    }

    public f(TextView textView, boolean z10) {
        androidx.core.util.h.g(textView, "textView cannot be null");
        this.f23978a = !z10 ? new c(textView) : new a(textView);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f23978a.a(inputFilterArr);
    }

    public void b(boolean z10) {
        this.f23978a.b(z10);
    }

    public void c(boolean z10) {
        this.f23978a.c(z10);
    }
}
