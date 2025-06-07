package rb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class a implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    private final Object[] f26677m;

    /* renamed from: n, reason: collision with root package name */
    private int f26678n;

    public a(Object[] objArr) {
        h.e(objArr, "array");
        this.f26677m = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f26678n < this.f26677m.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f26677m;
            int i10 = this.f26678n;
            this.f26678n = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f26678n--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
