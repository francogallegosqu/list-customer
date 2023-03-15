'use strict';

/**
 * form-contact controller
 */

const { createCoreController } = require('@strapi/strapi').factories;
const validateEmail = (email) => {
    return String(email)
      .toLowerCase()
      .match(
        /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/
      );
  }
module.exports = createCoreController('api::form-contact.form-contact', ({ strapi }) => ({
    
    async create(ctx) {
        const { name, email ,issue, message, business } = ctx.request.body
        console.log('request', ctx.request.body)
        const files =  ctx.request.files
        console.log('file', files, files.file.icd)
        if(!validateEmail(email)) {
            return ctx.send({
              message: 'Invalid email'
            }, 400)
          }
        const response = await strapi.plugins.email.services.email.send({
            to: 'services@gallegoscorporation.com',
            from: email,
            subject: `Contact from ${name}`,
            text: message,
            attachments: [
                {
                  filename: files.file.name,
                  path: files.file.path,
                //   cid: 'uniq-mailtrap.png' 
                }
              ]
            
        });
        // await super.create(ctx)
        return 'complete'
    }
}));
