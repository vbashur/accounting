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
 * A {@code FinancialDataRepository} provides access for storing and retrieving objects
 * from a generic data-source based on {@link FinancialDataCriteria}.
 */
public class FinancialDataRepository implements Repository<FinancialData>, SyncRepository.Readable<FinancialData>, SyncRepository.Writable<FinancialData> {

  private final Backend backend;

  private final SyncReadable<FinancialData> readable;
  private final SyncWritable<FinancialData> writable;

  public FinancialDataRepository(Backend backend) {
    this.backend = Objects.requireNonNull(backend, "backend");
    final Backend.Session session = backend.open(FinancialData.class);
    this.readable = new SyncReadable<FinancialData>(session);
    this.writable = new SyncWritable<FinancialData>(session);
  }

  @Override
  public SyncReader<FinancialData> find(Criterion<FinancialData> arg0) {
     return readable.find(arg0);
  }

  @Override
  public SyncReader<FinancialData> findAll() {
     return readable.findAll();
  }

  @Override
  public WriteResult insert(FinancialData doc) {
     return writable.insert(doc);
  }

  @Override
  public WriteResult insertAll(Iterable<? extends FinancialData> arg0) {
     return writable.insertAll(arg0);
  }

  @Override
  public WriteResult delete(Criterion<FinancialData> arg0) {
     return writable.delete(arg0);
  }

  @Override
  public WriteResult upsert(FinancialData doc) {
     return writable.upsert(doc);
  }

  @Override
  public WriteResult upsertAll(Iterable<? extends FinancialData> arg0) {
     return writable.upsertAll(arg0);
  }

  @Override
  public WriteResult update(FinancialData doc) {
     return writable.update(doc);
  }

  @Override
  public WriteResult updateAll(Iterable<? extends FinancialData> arg0) {
     return writable.updateAll(arg0);
  }

  @Override
  public Updater<FinancialData,WriteResult> update(Criterion<FinancialData> arg0) {
     return writable.update(arg0);
  }
}
