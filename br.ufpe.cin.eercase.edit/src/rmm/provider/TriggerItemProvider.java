/**
 */
package rmm.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import rmm.Attribute;
import rmm.RmmPackage;
import rmm.Table;
import rmm.Trigger;
import rmm.UniqueKey;

/**
 * This is the item provider adapter for a {@link rmm.Trigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggerItemProvider extends ConstraintItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInsertPropertyDescriptor(object);
			addUpdatePropertyDescriptor(object);
			addDeletePropertyDescriptor(object);
			addActionTimePropertyDescriptor(object);
			addConditionPropertyDescriptor(object);
			addStatementSQLPropertyDescriptor(object);
			addActionGranularityPropertyDescriptor(object);
			addOldRowPropertyDescriptor(object);
			addNewRowPropertyDescriptor(object);
			addOldTablePropertyDescriptor(object);
			addNewTablePropertyDescriptor(object);
			addAttributesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Action Granularity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionGranularityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_actionGranularity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_actionGranularity_feature", "_UI_Trigger_type"),
				 RmmPackage.Literals.TRIGGER__ACTION_GRANULARITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Old Row feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOldRowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_oldRow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_oldRow_feature", "_UI_Trigger_type"),
				 RmmPackage.Literals.TRIGGER__OLD_ROW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New Row feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewRowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_newRow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_newRow_feature", "_UI_Trigger_type"),
				 RmmPackage.Literals.TRIGGER__NEW_ROW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Old Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOldTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_oldTable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_oldTable_feature", "_UI_Trigger_type"),
				 RmmPackage.Literals.TRIGGER__OLD_TABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_newTable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_newTable_feature", "_UI_Trigger_type"),
				 RmmPackage.Literals.TRIGGER__NEW_TABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Insert feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsertPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_insert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_insert_feature", "_UI_Trigger_type"),
				 RmmPackage.Literals.TRIGGER__INSERT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Update feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_update_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_update_feature", "_UI_Trigger_type"),
				 RmmPackage.Literals.TRIGGER__UPDATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_delete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_delete_feature", "_UI_Trigger_type"),
				 RmmPackage.Literals.TRIGGER__DELETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_actionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_actionTime_feature", "_UI_Trigger_type"),
				 RmmPackage.Literals.TRIGGER__ACTION_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_condition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_condition_feature", "_UI_Trigger_type"),
				 RmmPackage.Literals.TRIGGER__CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Statement SQL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatementSQLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_statementSQL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_statementSQL_feature", "_UI_Trigger_type"),
				 RmmPackage.Literals.TRIGGER__STATEMENT_SQL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	protected void addAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_attributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_attributes_feature", "_UI_Trigger_type"),
				 RmmPackage.Literals.TRIGGER__ATTRIBUTES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) { 
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					Trigger uniqueKey = (Trigger) object;												
					Table table = (Table) uniqueKey.eContainer(); // Retrieve the classroom students					
					List<Attribute> attributes = new ArrayList<Attribute>(); // Copy the students to a temporary list
					attributes.addAll(table.getAttributes());
					attributes.remove(object); // Removes the student himself from the available friends
					// Sorts the result
					Collections.sort(attributes, new Comparator<Attribute>() {
						@Override
						public int compare(Attribute s1, Attribute s2) {
							String s1Name = s1.getName();
							String s2Name = s2.getName();
							if (s1Name == null && s2Name == null) {
								return 0;
							}
							else if (s1Name == null) {
								return 1;
							}
							else if (s2Name == null) {
								return -1;
							}
							else {
								return s1Name.compareTo(s2Name);
							}
						}
					});
					return attributes;
				}
			} );

	}

	/**
	 * This returns Trigger.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Trigger"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Trigger)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Trigger_type") :
			getString("_UI_Trigger_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Trigger.class)) {
			case RmmPackage.TRIGGER__INSERT:
			case RmmPackage.TRIGGER__UPDATE:
			case RmmPackage.TRIGGER__DELETE:
			case RmmPackage.TRIGGER__ACTION_TIME:
			case RmmPackage.TRIGGER__CONDITION:
			case RmmPackage.TRIGGER__STATEMENT_SQL:
			case RmmPackage.TRIGGER__ACTION_GRANULARITY:
			case RmmPackage.TRIGGER__OLD_ROW:
			case RmmPackage.TRIGGER__NEW_ROW:
			case RmmPackage.TRIGGER__OLD_TABLE:
			case RmmPackage.TRIGGER__NEW_TABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
