package com.riwi.repository.imodel;

import com.riwi.model.Event;
import com.riwi.repository.crud.Create;
import com.riwi.repository.crud.DeleteById;

public interface IModelEvent extends
        Create<Event>,
        DeleteById<Event>,
        com.riwi.repository.crud.ReadById<Event>,
        com.riwi.repository.crud.ReadAll<Event>,
        com.riwi.repository.crud.Update<Event> {
}
