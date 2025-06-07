package c8;

import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class c extends ObjectInputStream {

    /* renamed from: m, reason: collision with root package name */
    private final List f5057m;

    /* renamed from: n, reason: collision with root package name */
    private final List f5058n;

    public c(InputStream inputStream) {
        super(inputStream);
        this.f5057m = new ArrayList();
        this.f5058n = new ArrayList();
    }

    private void e(String str) throws InvalidClassException {
        Iterator it = this.f5058n.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).c(str)) {
                c(str);
            }
        }
        boolean z10 = false;
        Iterator it2 = this.f5057m.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((a) it2.next()).c(str)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        c(str);
    }

    public c a(Class... clsArr) {
        for (Class cls : clsArr) {
            this.f5057m.add(new b(cls.getName()));
        }
        return this;
    }

    protected void c(String str) throws InvalidClassException {
        throw new InvalidClassException("Class name not accepted: " + str);
    }

    @Override // java.io.ObjectInputStream
    protected Class resolveClass(ObjectStreamClass objectStreamClass) throws InvalidClassException {
        e(objectStreamClass.getName());
        return super.resolveClass(objectStreamClass);
    }
}
