// Generated by Dagger (https://dagger.dev).
package com.example.acapplication.view.activity;

import com.example.acapplication.viewmodel.viewmodelfactory.PaymentViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddPaymentActivity_MembersInjector implements MembersInjector<AddPaymentActivity> {
  private final Provider<PaymentViewModelFactory> paymentViewModelFactoryProvider;

  public AddPaymentActivity_MembersInjector(
      Provider<PaymentViewModelFactory> paymentViewModelFactoryProvider) {
    this.paymentViewModelFactoryProvider = paymentViewModelFactoryProvider;
  }

  public static MembersInjector<AddPaymentActivity> create(
      Provider<PaymentViewModelFactory> paymentViewModelFactoryProvider) {
    return new AddPaymentActivity_MembersInjector(paymentViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(AddPaymentActivity instance) {
    injectPaymentViewModelFactory(instance, paymentViewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.acapplication.view.activity.AddPaymentActivity.paymentViewModelFactory")
  public static void injectPaymentViewModelFactory(AddPaymentActivity instance,
      PaymentViewModelFactory paymentViewModelFactory) {
    instance.paymentViewModelFactory = paymentViewModelFactory;
  }
}