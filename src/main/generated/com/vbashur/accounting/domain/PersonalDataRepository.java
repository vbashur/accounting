package com.vbashur.accounting.domain;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import org.immutables.criteria.Criterias;
import org.immutables.criteria.Criterion;
import org.immutables.criteria.backend.Backend;
import org.immutables.criteria.backend.StandardOperations;
import org.immutables.criteria.backend.WriteResult;
import org.immutables.criteria.repository.Repository;
import org.immutables.criteria.repository.Updater;
import org.immutables.criteria.repository.Watcher;
import org.immutables.criteria.repository.reactive.ReactiveReader;
import org.immutables.criteria.repository.reactive.ReactiveRepository;
import org.immutables.criteria.repository.reactive.ReactiveWatcher;
import org.immutables.criteria.repository.sync.SyncReadable;
import org.immutables.criteria.repository.sync.SyncReader;
import org.immutables.criteria.repository.sync.SyncRepository;
import org.immutables.criteria.repository.sync.SyncWritable;
import org.reactivestreams.Publisher;

/**
 * A {@code PersonalDataRepository} provides access for storing and retrieving objects
 * from a generic data-source based on {@link PersonalDataCriteria}.
 */
public class PersonalDataRepository implements Repository<PersonalData>, SyncRepository.Readable<PersonalData>, SyncRepository.Writable<PersonalData> {

  private final Backend backend;

  private final SyncReadable<PersonalData> readable;
  private final SyncWritable<PersonalData> writable;

  public PersonalDataRepository(Backend backend) {
    this.backend = Objects.requireNonNull(backend, "backend");
    final Backend.Session session = backend.open(PersonalData.class);
    this.readable = new SyncReadable<PersonalData>(session);
    this.writable = new SyncWritable<PersonalData>(session);
  }

  @Override
  public SyncReader<PersonalData> find(Criterion<PersonalData> arg0) {
     return readable.find(arg0);
  }

  @Override
  public SyncReader<PersonalData> findAll() {
     return readable.findAll();
  }

  @Override
  public WriteResult insert(PersonalData doc) {
     return writable.insert(doc);
  }

  @Override
  public WriteResult insertAll(Iterable<? extends PersonalData> arg0) {
     return writable.insertAll(arg0);
  }

  @Override
  public WriteResult delete(Criterion<PersonalData> arg0) {
     return writable.delete(arg0);
  }

  @Override
  public WriteResult upsert(PersonalData doc) {
     return writable.upsert(doc);
  }

  @Override
  public WriteResult upsertAll(Iterable<? extends PersonalData> arg0) {
     return writable.upsertAll(arg0);
  }

  @Override
  public WriteResult update(PersonalData doc) {
     return writable.update(doc);
  }

  @Override
  public WriteResult updateAll(Iterable<? extends PersonalData> arg0) {
     return writable.updateAll(arg0);
  }

  @Override
  public Updater<PersonalData,WriteResult> update(Criterion<PersonalData> arg0) {
     return writable.update(arg0);
  }
}
