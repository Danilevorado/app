package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class h90 extends f4.a {
    public static final Parcelable.Creator<h90> CREATOR = new j90();

    /* renamed from: m, reason: collision with root package name */
    ParcelFileDescriptor f9065m;

    /* renamed from: n, reason: collision with root package name */
    private Parcelable f9066n = null;

    /* renamed from: o, reason: collision with root package name */
    private boolean f9067o = true;

    public h90(ParcelFileDescriptor parcelFileDescriptor) {
        this.f9065m = parcelFileDescriptor;
    }

    public final f4.d f(Parcelable.Creator creator) throws IOException {
        if (this.f9067o) {
            if (this.f9065m == null) {
                ze0.d("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f9065m));
            try {
                try {
                    int i10 = dataInputStream.readInt();
                    byte[] bArr = new byte[i10];
                    dataInputStream.readFully(bArr, 0, i10);
                    i4.k.a(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i10);
                        parcelObtain.setDataPosition(0);
                        this.f9066n = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.f9067o = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e5) {
                    ze0.e("Could not read from parcel file descriptor", e5);
                    i4.k.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                i4.k.a(dataInputStream);
                throw th2;
            }
        }
        return (f4.d) this.f9066n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) throws IOException {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f9065m == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.f9066n.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        of0.f13186a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.g90
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = bArrMarshall;
                                Parcelable.Creator<h90> creator = h90.CREATOR;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            i4.k.a(dataOutputStream2);
                                        } catch (IOException e5) {
                                            e = e5;
                                            dataOutputStream = dataOutputStream2;
                                            ze0.e("Error transporting the ad response", e);
                                            j3.t.q().u(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                i4.k.a(outputStream);
                                            } else {
                                                i4.k.a(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                i4.k.a(outputStream);
                                            } else {
                                                i4.k.a(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e5) {
                        e = e5;
                        ze0.e("Error transporting the ad response", e);
                        j3.t.q().u(e, "LargeParcelTeleporter.pipeData.2");
                        i4.k.a(autoCloseOutputStream);
                        this.f9065m = parcelFileDescriptor;
                        int iA = f4.c.a(parcel);
                        f4.c.p(parcel, 2, this.f9065m, i10, false);
                        f4.c.b(parcel, iA);
                    }
                } catch (IOException e10) {
                    e = e10;
                    autoCloseOutputStream = null;
                }
                this.f9065m = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iA2 = f4.c.a(parcel);
        f4.c.p(parcel, 2, this.f9065m, i10, false);
        f4.c.b(parcel, iA2);
    }
}
