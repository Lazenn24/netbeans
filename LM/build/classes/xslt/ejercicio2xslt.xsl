<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

   
    <xsl:template match="/">
        <html>
            <body>
                <h1>
                    <xsl:value-of select="ies/@nombre"/>
                </h1>
                <p>Página web: <a href=<xsl:value-of select="ies/@web">LINK</a></p>
                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="ciclos">
    
        <xsl:for-each select="ciclo">
           
            <p>
                <xsl:value-of select="nombre"/>
            </p>
        
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>
