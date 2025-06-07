package u0;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface g extends Closeable {
    boolean A();

    Cursor B(j jVar, CancellationSignal cancellationSignal);

    boolean E();

    void H();

    void I(String str, Object[] objArr);

    void J();

    int K(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    Cursor S(String str);

    void i();

    void j();

    boolean m();

    List n();

    void p(String str);

    Cursor r(j jVar);

    k u(String str);

    String z();
}
