package com.gacrnd.gcs.binder.common;

import android.os.IInterface;
import android.os.RemoteException;

import com.gacrnd.gcs.binder.bean.Person;

import java.util.List;

public interface IPersonManager extends IInterface {

    void addPerson(Person person) throws RemoteException;

    List<Person> getPersonList() throws RemoteException;
}
