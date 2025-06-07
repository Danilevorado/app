package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface l extends IInterface {

    public static abstract class a extends Binder implements l {

        /* renamed from: androidx.room.l$a$a, reason: collision with other inner class name */
        private static class C0057a implements l {

            /* renamed from: n, reason: collision with root package name */
            public static l f3735n;

            /* renamed from: m, reason: collision with root package name */
            private IBinder f3736m;

            C0057a(IBinder iBinder) {
                this.f3736m = iBinder;
            }

            @Override // androidx.room.l
            public void C2(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    if (this.f3736m.transact(1, parcelObtain, null, 1) || a.w0() == null) {
                        return;
                    }
                    a.w0().C2(strArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3736m;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static l C(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l)) ? new C0057a(iBinder) : (l) iInterfaceQueryLocalInterface;
        }

        public static l w0() {
            return C0057a.f3735n;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                C2(parcel.createStringArray());
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
    }

    void C2(String[] strArr);
}
