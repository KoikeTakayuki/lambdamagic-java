package jp.lambdamagic.event;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import jp.lambdamagic.event.log.ConsoleEventLogTest;
import jp.lambdamagic.event.log.FileEventLogTest;

@RunWith(Suite.class)
@SuiteClasses(
	{
		EventListenerManagerTest.class,
		NotificationEventTest.class,
		ProgressEventTest.class,
		ConsoleEventLogTest.class,
		FileEventLogTest.class
	})
public class EventPackageTestSuite {}