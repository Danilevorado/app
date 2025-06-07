package r6;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private final float f26647a;

    /* renamed from: b, reason: collision with root package name */
    private final float f26648b;

    public m(float f5, float f10) {
        this.f26647a = f5;
        this.f26648b = f10;
    }

    private static float a(m mVar, m mVar2, m mVar3) {
        float f5 = mVar2.f26647a;
        float f10 = mVar2.f26648b;
        return ((mVar3.f26647a - f5) * (mVar.f26648b - f10)) - ((mVar3.f26648b - f10) * (mVar.f26647a - f5));
    }

    public static float b(m mVar, m mVar2) {
        return t6.a.a(mVar.f26647a, mVar.f26648b, mVar2.f26647a, mVar2.f26648b);
    }

    public static void e(m[] mVarArr) {
        m mVar;
        m mVar2;
        m mVar3;
        float fB = b(mVarArr[0], mVarArr[1]);
        float fB2 = b(mVarArr[1], mVarArr[2]);
        float fB3 = b(mVarArr[0], mVarArr[2]);
        if (fB2 >= fB && fB2 >= fB3) {
            mVar = mVarArr[0];
            mVar2 = mVarArr[1];
            mVar3 = mVarArr[2];
        } else if (fB3 < fB2 || fB3 < fB) {
            mVar = mVarArr[2];
            mVar2 = mVarArr[0];
            mVar3 = mVarArr[1];
        } else {
            mVar = mVarArr[1];
            mVar2 = mVarArr[0];
            mVar3 = mVarArr[2];
        }
        if (a(mVar2, mVar, mVar3) < 0.0f) {
            m mVar4 = mVar3;
            mVar3 = mVar2;
            mVar2 = mVar4;
        }
        mVarArr[0] = mVar2;
        mVarArr[1] = mVar;
        mVarArr[2] = mVar3;
    }

    public final float c() {
        return this.f26647a;
    }

    public final float d() {
        return this.f26648b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f26647a == mVar.f26647a && this.f26648b == mVar.f26648b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f26647a) * 31) + Float.floatToIntBits(this.f26648b);
    }

    public final String toString() {
        return "(" + this.f26647a + ',' + this.f26648b + ')';
    }
}
