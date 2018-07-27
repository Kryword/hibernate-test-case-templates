
package org.hibernate.bugs;

import org.hibernate.Session;
import org.hibernate.testing.junit4.BaseCoreFunctionalTestCase;
import org.junit.Test;

/**
 * This template demonstrates how to develop a standalone test case for Hibernate ORM.  Although this is perfectly
 * acceptable as a reproducer, usage of ORMUnitTestCase is preferred!
 */
public class CityStandaloneTestCase extends BaseCoreFunctionalTestCase {
  @Override
  protected String[] getMappings() {
    return new String[] {"City.hbm.xml", "City_ComputedColumns.hbm.xml"};
  }

  @Test
  public void hhh123Test() {
    Session session = openSession();
    session.createQuery("select id, name, _computedColumns.nameZIPCode from City").list();
    session.close();
  }
}
