<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>"Basic Distance Calculator" </title>

    </head>

    <body>
     <h1>Welcome to DistanceCalculator!</h1>
     <h2><s:property value="model.distance" /></h2>
     <s:url action="calculate" var="helloLink">
         <s:param name="calculationType">Bruce Phillips</s:param>
     </s:url>

     <a href="<s:url action="index" namespace="config-browser" />">Launch the configuration browser</a>


     <p><a href="${helloLink}">Hello Bruce Phillips</a></p>

     <p>Calculate your Distance.</p>

     <s:form action="calculate">
         <s:textfield name="calculationType" label="Calculate Type" />
         <s:textfield name="fromCity" label="City From" />
         <s:textfield name="toCity" label="City To" />

         <s:submit value="Calculate" />

     </s:form>

    </body>
</html>