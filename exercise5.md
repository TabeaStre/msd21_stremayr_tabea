**Why do we use logging libraries?**
- Standardised logging 
- enable/disable logs without recompilation
- automatically show log context (classname, date, time)

**Loglevels in Log4j2**
- OFF – No events will be logged.
- ALL – To log all events.
- TRACE – A fine-grained debug message, typically capturing the flow through the application.
- DEBUG – A general debugging event.
- INFO – An event for informational purposes.
- WARN – An event that might possibly lead to an error.
- ERROR – An error in the application, possibly recoverable.
- FATAL – A severe error that will prevent the application from continuing.

Above you can see the right order of loglevels from top to bottom. If you pick a loglevel all events from this level and all levels below will be logged. Every loglevel has its own purpose and at the bottom of the list are the most severe loglevels. 

**Configurations offered by log4j2**
- You can define where to output the log, for example to the console or a file. 
- You can define the metadata (date, time, loglevel,...) separately for each log output.
- You can define the loglevel for each logger separately.
- For file loggers you can choose to either append the logs or overwrite them.